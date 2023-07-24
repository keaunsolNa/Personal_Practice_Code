const handler = {
    get: function(target, name) {
        return name === 'name' ? `${target.a} ${target.b}` : target[name]
    }
}

const p = new Proxy({a: "keaunsol", b: 'Is Developer'}, handler) 
console.log(p.name)     // keaunsol Is Developer

function createReactiveObject(target, callback) {
    const proxy = new Proxy(target, {
        set(obj, prop, value) {
            if(value !== obj[prop]) {
                const prev = obj[prop]
                obj[prop] = value
                callback(`${prop}이 [${prev}] >> [${value}]로 변경되었습니다. `)
            }
            return true
        }
    })
    return proxy
}

const a = {
    "keaunsol" : "Coder"
}

const b = createReactiveObject(a, console.log)
b.keaunsol = "Coder"
b.keaunsol = "Developer"
// keaunsol이 [Coder] >> [Developer]로 변경되었습니다. v

// function createReactiveObject(
//     target: Target,
//     isReadonly: boolean,
//     baseHandlers: ProxyHandler<any>, 
//     collectionHandlers: ProxyHandler<any>,
//     proxyMap: WeakMap<Target, any>
// )  {
//     if(!isObject(target)) {
//         if(__DEV__) {
//             console.warn(`value cannot be made reactive: ${String(target)}`)
//         }
//         return target
//     }

//     // target is alerady a Proxy, return it.
//     // exception: calling readonly() on a reactive object

//     if(
//         target[ReactiveFlags.RAM] && 
//         !(isReadonly && target[ReactiveFlags.IS_REACTIVE])
//     ) {
//         return target
//     }

//     // target already has corresponding proxy
//     const existingProxy = proxyMap.get(target)
//     if(existingProxy) {
//         return existingProxy
//     }

//     // only a whitelist of value types can be observerd.
//     const targetType = getTargetType(target)
//     if(targetType == targetType.INVALID) {
//         return target
//     }

//     const proxy = new Proxy(
//         target, 
//         targetType === targetType.COLLECTION ? collectionHandlers : baseHandlers
//     )

//     proxyMap.set(target, proxy)
//     return proxy
// }