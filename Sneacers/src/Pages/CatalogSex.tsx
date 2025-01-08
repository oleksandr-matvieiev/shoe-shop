import CatName from "../components/CatName";
import ProdactMap from "../components/ProdactMap";
import { useLoaderData, useParams } from "react-router-dom";

const CatalogSex = () => {
  const data: any = useLoaderData();
  const params: any = useParams();

  const shoes: any[] = data.data;
  console.log(shoes);

  return (
    <>
      <CatName name={params.sex} />
      <ProdactMap shoes={shoes} />
    </>
  );
};

export default CatalogSex;
