import {
  Route,
  createBrowserRouter,
  createRoutesFromElements,
  RouterProvider,
} from "react-router-dom";
import Layout from "./components/Layout";
import HomePage from "./Pages/HomePage";
import Catalog from "./Pages/Catalog";
import InfoShoe from "./Pages/InfoShoe";
import axios from "axios";
import CatalogSex from "./Pages/CatalogSex";

const BaseUrl = "http://localhost:8080";

axios.defaults.headers.common["Access-Control-Allow-Origin"] = "*";
axios.defaults.headers.common["Content-Type"] = "application/json";
axios.defaults.headers.common["Access-Control-Allow-Methods"] =
  "GET, PUT, POST, DELETE, OPTIONS";

//For Catalog
const load = async ({ params }) => {
  console.log(params);
  if (params.sex)
    return await axios.get(`${BaseUrl}/api/shoes/list/${params.sex}`);
  else return await axios.get(`${BaseUrl}/api/shoes/list/all`);
};

//For ShoeInformation
const loadShoe = async ({ params }) => {
  return await axios.get(`${BaseUrl}/api/shoes/${params.id}`);
};

const router = createBrowserRouter(
  createRoutesFromElements(
    <Route path="/" element={<Layout />}>
      <Route path="/" element={<HomePage />}></Route>
      <Route path="/home" element={<HomePage />}></Route>
      <Route path="/catalog" element={<Catalog />} loader={load}></Route>
      <Route
        path="/catalog/:sex"
        element={<CatalogSex />}
        loader={load}
      ></Route>
      <Route path="/info/:id" element={<InfoShoe />} loader={loadShoe}></Route>
    </Route>
  )
);

function App() {
  return (
    <>
      <RouterProvider router={router}></RouterProvider>
    </>
  );
}
export default App;
