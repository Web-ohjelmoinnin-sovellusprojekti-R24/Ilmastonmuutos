import './App.css';
import Login from './components/Login';
import Home from './components/Home';
import CreateView from './components/CreateView'
import {Routes, Route, BrowserRouter, Link} from "react-router-dom";
import V5 from './components/V5';
import V9_try from './components/v9_try';
import V1_V2 from './components/V1_V2';
import V3 from './components/V3';
import Button from 'react-bootstrap/Button';
import CreateUser from './components/CreateUser';
import Settings from './components/Settings';
import {Nav, navbar} from 'react-bootstrap';

function App() {

  return (
    <div>
      <div className='navbar'>
        <Nav>
        <Link to="/views"><div>Create new view</div></Link>
        <Link to="/"><div>Logout</div></Link>
        </Nav>
        
        
 
      </div>
        <Routes>
        <Route path="/" element={<Login/>}/>
        <Route path='/views' element={<CreateView/>}/>
        <Route path="/v1" element={<V1_V2/>}/>
        <Route path="/v3" element={<V3/>}/>
        <Route path="/v5" element={<V5/>}/>
        <Route path="/v9" element={<V9_try/>}/>
        <Route path="/createuser" element={<CreateUser/>}/>
        <Route path="/settings" element={<Settings/>}/>
        </Routes>
    </div> 
  );
}


export default App;