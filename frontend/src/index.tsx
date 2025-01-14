import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import {BrowserRouter, Route, Routes} from "react-router-dom";
import TaskEditor from "./components/TaskEditor";
import Heading from "./components/Heading";
import 'bootstrap/dist/css/bootstrap.css';
import RegisterPage from "./components/RegisterPage";
import LoginPage from "./components/LoginPage";


const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);

root.render(

  <React.StrictMode>
      <Heading/>
      <BrowserRouter>
          <Routes>
              <Route path={"/register"} element={<RegisterPage />}></Route>
              <Route path={"/"} element={<LoginPage />} />
              <Route path={"/app"} element={ <App />}/>
              <Route path={"/edit/:id"} element={<TaskEditor/>}/>

          </Routes>
      </BrowserRouter>

  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
