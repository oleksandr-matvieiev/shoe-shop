interface Prop {
  id: any;
}

const Info = ({ id: { shoes, sizesList } }: Prop) => {
  return (
    <div className="wrapper_all">
      <div className="wrap_info">
        <div className="card_info_body">
          <div className="card_info_body_img">
            <img
              src={shoes.photo_url}
              className="info_img"
              alt="Shoe photo"
            ></img>
          </div>

          <div className="card_info_body_text">
            <p className="card_info_name">{shoes.shoes_name}</p>
            <p className="card_info_article">{shoes.shoes_article}</p>
            <p className="weight">Sizes:</p>

            <p className="card_info_size">
              {sizesList.map((s: any) => s.size).join("  ")}
            </p>
            <p className="weight">Colors:</p>
            <p className="card_info_color">{shoes.color}</p>
          </div>
        </div>

        <div className="card_info_details">
          <p className="card_info_price">{shoes.price} grn</p>
          <p className="weight">Description:</p>
          <p className="card_info_description">{shoes.description}</p>
          <button className="card_info_button">Buy</button>
        </div>
      </div>
    </div>
  );
};

export default Info;
