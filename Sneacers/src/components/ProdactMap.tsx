import Product from "./Product";
interface Prop {
  shoes: any[];
}

const ProdactMap = ({ shoes }: Prop) => {
  return (
    <>
      {shoes.map((item) => (
        <Product shoe={item} key={item.shoesId} />
      ))}
    </>
  );
};

export default ProdactMap;
