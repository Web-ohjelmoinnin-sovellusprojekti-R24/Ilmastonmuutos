import './App.css';
import Login from './components/Login';
import Home from './components/Home';
import V1 from './components/V1';
import CreateView from './components/CreateView'
import {Routes, Route, BrowserRouter, Link} from "react-router-dom";

function App() {

  return (
    <div>
      <div className='navbar'>
        <div>Create new view</div>
        <div>Logout</div>
        <div>Temperature data and co2 concentrations</div>
        <div>Emission sources</div>
      </div>
        <Routes>
        <Route path="/" element={<Login/>}/>
        <Route path='/views' element={<CreateView/>}/>
        <Route path="/v1" element={<V1/>}/>
        </Routes>
    </div> 
  );
}

export default App;