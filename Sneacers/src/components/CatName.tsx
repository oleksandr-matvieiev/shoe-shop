interface Prop {
  name: string;
}

const CatName = ({ name }: Prop) => {
  return (
    <>
      <p className="name">{name} catalog</p>
    </>
  );
};

export default CatName;
