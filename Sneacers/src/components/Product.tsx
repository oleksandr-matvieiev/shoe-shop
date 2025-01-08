import { NavLink } from "react-router-dom";

interface Prop {
  shoe: any;
}

const Product = ({ shoe }: Prop) => {
  return (
    <div className="wrapper_all">
      <div className="card_prod">
        <img src={shoe.photo_url} className="card_prod_img" alt="Shoes"></img>
        <div className="card_prod_body">
          <h5 className="card_prod_title">{shoe.shoes_name}</h5>
          <p className="card_prod_text">
            {shoe.sex} {shoe.shoes_article}
          </p>
          <NavLink to={`/info/${shoe.shoesId}`}>
            <button className="card_prod_button">View more</button>
          </NavLink>
        </div>
      </div>
    </div>
  );
};

export default Product;
