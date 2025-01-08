import { NavLink } from "react-router-dom";
import women from "../images/Women.jpg";
import men from "../images/Men.jpg";

const Card = () => {
  return (
    <div className="wrapper_all">
      <NavLink to="/catalog/women">
        <div className="card">
          <img src={women} className="card_img" alt="Women shoes"></img>
        </div>
      </NavLink>

      <NavLink to="/catalog/men">
        <div className="card">
          <img src={men} className="card_img" alt="Man shoes"></img>
        </div>
      </NavLink>
    </div>
  );
};

export default Card;
