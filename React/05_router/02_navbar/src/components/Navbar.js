// import {Link} from 'react-router-dom';

// function Navbar() {
//     return(
//         // <div>
//         //     <ul>
//         //         <li><a href={"/"}>Home</a></li>
//         //         <li><a href={"/mypage"}>마이페이지</a></li>
//         //         <li><a href={"/login"}>로그인</a></li>
//         //     </ul>
//         // </div>
//         // <div>
//         //     <ul>
//         //         <li><Link to="/">Home</Link></li>
//         //         <li><Link to="/mypage">마이페이지</Link></li>
//         //         <li><Link to="/login">로그인</Link></li>
//         //     </ul>
//         // </div>

//     )
// }

// export default Navbar;

import {NavLink} from 'react-router-dom';

/*
    <NavLink> 컴포넌트 사용
    NavLink 컴포넌트는 Link 컴포넌트와 사용이 거의 유사하다. 
    하지만 현재 Nav의 상태가 active인지에 대한 값을 이용하여 스타일을 조작하거나 클래스 이름을 변경할 수 있다. 
*/
function Navbar() {

    const activeStyle = {
        backgroundColor : 'blue'
    }

    return (
        <div>
            <ul>
                <li><NavLink to="/" style={({isActive}) => isActive ? activeStyle : undefined} >Home</NavLink></li>
                <li><NavLink to="/mypage" style={({isActive}) => isActive ? activeStyle : undefined} >마이페이지</NavLink></li>
                <li><NavLink to="/login" style={({isActive}) => isActive ? activeStyle : undefined} >로그인</NavLink></li>
            </ul>
        </div>

    )
}

export default Navbar;