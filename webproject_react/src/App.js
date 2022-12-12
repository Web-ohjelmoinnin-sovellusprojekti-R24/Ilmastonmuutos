import './App.css';
import Login from './pages/Login';
import CreateView from './pages/CreateView'
import {Routes, Route, BrowserRouter, Link} from "react-router-dom";
import V5 from './visualizations/V5';
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
import V8 from './visualizations/V8';


function App() {

  return (

    
    <div>

        <NavBar/>
      
        <Routes>
        <Route path="/" element={<CreateView/>}/>
        <Route path="/createuser" element={<CreateUser/>}/>
        <Route path="/login" element={<Login/>}/>
        <Route path='/create' element={<CreateView/>}/>
        <Route path="/settings" element={<Settings/>}/>
        <Route path="/myviews" element={<MyViews/>}/>

        <Route path="/default1" element={<Default1/>}/>
        <Route path="/default2" element={<Default2/>}/>
      
        <Route path="/v1" element={<V1_V2/>}/>
        <Route path="/v3" element={<V3/>}/>
        <Route path="/v5" element={<V5/>}/>
        <Route path="/v6" element={<V6/>}/>
        <Route path="/v7" element={<V7/>}/>
        <Route path="/v8" element={<V8/>}/>

        </Routes>
    </div> 
  );
}


export default App;