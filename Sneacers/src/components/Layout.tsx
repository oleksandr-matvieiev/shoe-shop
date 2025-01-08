import { Outlet } from "react-router-dom";
import Navigation from "./Navigation";

const Layout = () => {
  return (
    <>
      <Navigation />
      <div className="wrapper">
        <Outlet></Outlet>
      </div>
    </>
  );
};

export default Layout;
