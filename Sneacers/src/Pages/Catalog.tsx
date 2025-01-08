import CatName from "../components/CatName";
import ProdactMap from "../components/ProdactMap";
import { useLoaderData } from "react-router-dom";

const Catalog = () => {
  const data: any = useLoaderData();

  const shoes: any[] = data.data;
  console.log(shoes);

  return (
    <>
      <CatName name={""} />
      <ProdactMap shoes={shoes} />
    </>
  );
};

export default Catalog;
