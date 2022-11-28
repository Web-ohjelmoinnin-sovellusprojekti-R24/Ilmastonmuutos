import './App.css';
import Login from './components/Login';
import Home from './components/Home';
import V1 from './components/V1';
import CreateView from './components/CreateView'
import {Routes, Route, BrowserRouter, Link} from "react-router-dom";
import V5 from './components/V5';
import V4 from './components/V4';
import V9_try from './components/v9_try';

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
        <Route path="/v1" element={<V1/>}/>
        <Route path="/v5" element={<V5/>}/>
        <Route path="/v4" element={<V4/>}/>
        <Route path="/v9" element={<V9_try/>}/>
        </Routes>
    </div> 
  );
}

export default App;