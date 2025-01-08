import { NavLink } from "react-router-dom";

const Navigation = () => {
  return (
    <div className="navbar">
      <div className="container-fluid">
        <NavLink to="/catalog">
          <p className="navbar_comp">Catalog</p>
        </NavLink>
        <NavLink to="/home">
          <span className="navbar_name">Lace up</span>
        </NavLink>
        <a className="navbar_comp" href="#">
          Exit
        </a>
      </div>
    </div>
  );
};

export default Navigation;
