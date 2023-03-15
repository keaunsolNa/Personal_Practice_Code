import menus from '../data/menu-detail.json';

/* json 파일로부터 전체 메뉴 리스트 반환 */
export function getMenuList() {

    /* json으로 파싱 된 데이터를 반환한다. */
    return menus;
}

/* MenuDetails에서 넘겨준 메뉴코드 값과 일치하는 메뉴 객체를 반환 */
export function getMenuDetail(menuCode) {
    // console.log('detail 페이지에서 넘어온 메뉴 코드 값: ', menuCode);
    // console.log(typeof menuCode);        
    // pathVariable에서 꺼내온 값은 문자열이다.

    /* 파싱된 데이터에서 꺼낸 객체의 menuCode는 숫자이므로 넘겨받은 값을 Number형으로 변환하자. */
    /* menus 배열에서 filter의 콜백함수가 true를 반환하게 하는 배열 요소만을 가지고 다시 배열로 반환 */
    // console.log(menus.filter(menu => menu.menuCode === parseInt(menuCode))[0]); 

    return menus.filter(menu => menu.menuCode === parseInt(menuCode))[0];
}

export function searchMenu(searchMenuName) {
    // console.log('abc'.match('ab'));              
    // match 함수는 포함 여부에 따라 인수값이 포함되어 있으면 객체를 반환한다.
    // console.log(menus.filter(menu => menu.menuName.match(searchMenuName))); 
    // 검색어를 포함한 menu객체들을 배열로 반환한다.

    return menus.filter(menu => menu.menuName.match(searchMenuName));
}

