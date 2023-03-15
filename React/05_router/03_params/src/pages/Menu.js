import {useEffect, useState} from 'react';
import {getMenuList} from '../api/MenuAPI';
import MenuItem from '../components/MenuItem';
import boxStyle from './Menu.module.css';
import {useNavigate} from 'react-router-dom';       // 쿼리스트링으로 작성한 url 요청을 도와줄 hooks

function Menu() {
    const [menuList, setMenuList] = useState([]);
    const [searchValue, setSearchValue] = useState('');
    const navigate = useNavigate();

    useEffect(
        () => {
            /* Menu 컴포넌트가 마운트 되기 전에 데이터를 가져와서 state에 담는다. */
            // console.log(getMenuList());     

            // Menu컴포넌트 마운트 시점에 api 폴더의 MenuAPI.js에 있는 함수를
            // 활용하여 json으로 파싱 된 db데이터를 불러옴
            
            /* json으로 파싱된 데이터들은 console.table로 찍어보면 표 형태로 나온다.(파싱 안된건 안나옴) */
            // console.table(getMenuList());

            setMenuList(getMenuList());                         
        },
        []
    );

    /* 검색 버튼을 누르면 쿼리스트링 형태로 검색어를 전달한다. */
    const onClickHandler = () => {
        // console.log(searchValue);

        /* useNavigate 훅을 이용하여 링크를 이동시킬 수 있다. */
        navigate(`/menu/search?menuName=${searchValue}`);
    };

    return (
        <>
            <h1>판매 메뉴 목록</h1>

            <div>
                <input type="search" name="menuName" onChange={(e) => {setSearchValue(e.target.value)}}/>
                <button onClick={onClickHandler}>검색</button>
            </div>

            <div className={boxStyle.MenuBox}>
                {menuList.map(menu => <MenuItem key={menu.menuCode} menu={menu}/>)}
            </div>
        </>
    );
}

export default Menu;

