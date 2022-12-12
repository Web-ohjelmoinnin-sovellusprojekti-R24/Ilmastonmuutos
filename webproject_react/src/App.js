import './App.css';
import Login from './pages/Login';
import {Routes, Route, BrowserRouter, Link} from "react-router-dom";
import V5 from './visualizations/V5';
import V9_try from './visualizations/v9_try';
import V1_V2 from './visualizations/V1_V2';
import V3 from './visualizations/V3';
import Button from 'react-bootstrap/Button';
import V6 from './visualizations/V6';
import V7 from './visualizations/V7';
import NavBar from './components/NavBar';
import CreateUser from './pages/CreateUser';
import Settings from './pages/Settings';
import Default1 from './pages/Default1';
import Default2 from './pages/Default2';
import MyViews from './pages/MyViews';
import CreateViewHome from './pages/CreateViewHome';
import CreateView1 from './pages/CreateView1'
import CreateView2 from './pages/CreateView2'


function App() {

  return (

    
    <div>

        <NavBar/>
      
        <Routes>
        <Route path="/" element={<CreateViewHome/>}/>
        <Route path="/createview" element={<CreateViewHome/>}/>
        <Route path='/createview1' element={<CreateView1/>}/>
        <Route path='/createview2' element={<CreateView2/>}/>
        <Route path="/createuser" element={<CreateUser/>}/>
        <Route path="/login" element={<Login/>}/>
        <Route path="/settings" element={<Settings/>}/>
        <Route path="/myviews" element={<MyViews/>}/>

        <Route path="/default1" element={<Default1/>}/>
        <Route path="/default2" element={<Default2/>}/>
      
        <Route path="/v1" element={<V1_V2/>}/>
        <Route path="/v3" element={<V3/>}/>
        <Route path="/v5" element={<V5/>}/>
        <Route path="/v6" element={<V6/>}/>
        <Route path="/v7" element={<V7/>}/>
        <Route path="/v9" element={<V9_try/>}/>

        </Routes>
    </div> 
  );
}


export default App;