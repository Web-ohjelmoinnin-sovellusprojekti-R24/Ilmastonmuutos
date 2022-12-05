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
import V6 from './components/V6';
import V7 from './components/V7';

function App() {

  return (
    <div>
      <div className='navbar'>
        <div>Create new view</div>
        <Link to="/"><div>Logout</div></Link>
        <div>Temperature data and co2 concentrations</div>
        <div>Emission sources</div>  
 
      </div>
        <Routes>
        <Route path="/" element={<Login/>}/>
        <Route path='/views' element={<CreateView/>}/>
        <Route path="/v1" element={<V1_V2/>}/>
        <Route path="/v3" element={<V3/>}/>
        <Route path="/v5" element={<V5/>}/>
        <Route path="/v6" element={<V6/>}/>
        <Route path="/v7" element={<V7/>}/>
        </Routes>
    </div> 
  );
}


export default App;