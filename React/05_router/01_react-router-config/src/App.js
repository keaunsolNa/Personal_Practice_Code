import Main from './pages/Main';
import About from './pages/About';
import Menu from './pages/Menu';
import {BrowserRouter, Routes, Route} from 'react-router-dom';

function App() {

    /*
      npx create-react-app ./
      이후 기본 세팅
      1. src 폴더에 App.js랑 index.js 빼고 나머지 파일은 지운다.
      2. App.js 및 index.js에서 필요한 코드를 제외하고 지운다.
      3. npm install react-router-dom@6으로 라우터 라이브러리를 추가한다.

      라우팅
      : 어떤 요청을 어디로 안내 및 매핑을 할 것인지를 정해놓고 진행하는 것
        리액트 에서는 요청에 따라 요청에 매핑 된 컴포넌트를 렌더링 한다.

      BrowserRouter: 라우팅이 필요한 컴포넌트들을 감싸는 컴포넌트
      Routes: Route들을 묶어주는 단위(컴포넌트)
      Route: url 요청 주소와 컴포넌트를 매핑해 주는 단위(컴포넌트)
    */


  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route index element={<Main/>}/>
          {/* <Route path="/" element={<Main/>}/> */}
          <Route path="/about" element={<About/>}/>
          <Route path="/menu" element={<Menu/>}/>
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
