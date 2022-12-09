import './App.css';
import Login from './pages/Login';
import CreateView from './pages/CreateView'
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


function App() {

  return (

    
    <div>

        <NavBar/>
      
        <Routes>
        <Route path="/" element={<CreateUser/>}/>
        <Route path="/createuser" element={<CreateUser/>}/>
        <Route path="/login" element={<Login/>}/>
        <Route path='/create' element={<CreateView/>}/>
        <Route path="/v1" element={<V1_V2/>}/>
        <Route path="/v3" element={<V3/>}/>
        <Route path="/v5" element={<V5/>}/>
        <Route path="/v6" element={<V6/>}/>
        <Route path="/v7" element={<V7/>}/>
        <Route path="/v9" element={<V9_try/>}/>

        <Route path="/settings" element={<Settings/>}/>
        </Routes>
    </div> 
  );
}


export default App;