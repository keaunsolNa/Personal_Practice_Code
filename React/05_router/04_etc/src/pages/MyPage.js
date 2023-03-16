import { Navigate } from "react-router-dom";

function MyPage() {
    const isLogin = false;

    if(!isLogin) {

        /*
            컴포넌트 내에서 권한이나 다른 특정 상황에 의해 다른 페이지로 연동하고 싶을 때 Navigate 컴포넌트를 사용할 수 있다. 
            useNavigate와 같은 기능이지만 함수식으로 작성할 것인지 컴포넌트 형태로 작성할 것인지에 따라
            useNavigate와 Navigate 중에 선택하면 된다. 
            (03_params 폴더의 Menu.js 예제에서 useNavigate 사용했던 것 확인 가능)
        */
        return <Navigate to="/login"/>
    }

    return (
        <div>
            <h1>마이 페이지</h1>
        </div>

    )
}

export default MyPage;