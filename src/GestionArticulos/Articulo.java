package GestionArticulos;


public class Articulo {
	//Atributos
	private int id;
	private String nombre;
	private double precio;
	//Tipo enumerado, ¿instanciado?
	CATEGORIAS TEXTIL, BAZAR, ALIMENTACION, HOGAR;
	private int unidadesStock;
	//constructor

	public Articulo(int id, String nombre, double precio, CATEGORIAS categoria, int unidadesStock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		//Si la categoria es una de las existentes la inicializamos a la categoria correspondiente
		switch (categoria) {
		case TEXTIL:
			categoria = CATEGORIAS.TEXTIL;
			break;
		case BAZAR:
			categoria = CATEGORIAS.BAZAR;
			break;
		case ALIMENTACION:
			categoria = CATEGORIAS.ALIMENTACION;
			break;
		case HOGAR:
			categoria = CATEGORIAS.HOGAR;
			break;
		//Si no hay ninguna categoria señalada, la categoria por defecto sera la de textil
		default:
			categoria = CATEGORIAS.TEXTIL;
			break;
		}
	
		if (unidadesStock > 0)
			this.unidadesStock = unidadesStock;
		//si las unidades son de valor negativo, se inicializa a 0
		else
			this.unidadesStock = 0;
		
	}
	
	//metodos
	/**
	 * Metodo que se encarga de incrementar el precio segun el porcentaje
	 * pasado por parametro
	 * @param porcentaje
	 * @return
	 */
	public double incrementarPrecio(double porcentaje) {
		precio = precio + ((porcentaje/100)*porcentaje);
		return precio;
	}
	

	/**
	 * Metodo encargado de decrementar el precio segun el porcentaje 
	 * pasado por parametro
	 * @param porcentaje
	 * @return
	 */
	public double decrementarPrecio(double porcentaje) {
		precio = precio - ((porcentaje/100)*porcentaje);
		return precio;
	}
	
	/**
	 * Metodo encargado de actualizar el Stock actual segun el pasado por parametro
	 * @param unidadesNuevas
	 * @return
	 */
	public int actualizaStock(int unidadesNuevas) {
		unidadesStock = unidadesStock + unidadesNuevas;
		//La comprobacion para ver si el stock es negativo o no se decidio hacerlo en el constructor
		//debido a que si desde el principio se crea un objeto con un stock negativo, directamente ese valor sera 0
		return unidadesStock;
	}
	
	//Getter y Setter
	//Por si acaso
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public CATEGORIAS getTEXTIL() {
		return TEXTIL;
	}

	public void setTEXTIL(CATEGORIAS tEXTIL) {
		TEXTIL = tEXTIL;
	}

	public CATEGORIAS getBAZAR() {
		return BAZAR;
	}

	public void setBAZAR(CATEGORIAS bAZAR) {
		BAZAR = bAZAR;
	}

	public CATEGORIAS getALIMENTACION() {
		return ALIMENTACION;
	}

	public void setALIMENTACION(CATEGORIAS aLIMENTACION) {
		ALIMENTACION = aLIMENTACION;
	}

	public CATEGORIAS getHOGAR() {
		return HOGAR;
	}

	public void setHOGAR(CATEGORIAS hOGAR) {
		HOGAR = hOGAR;
	}

	public int getUnidadesStock() {
		return unidadesStock;
	}

	public void setUnidadesStock(int unidadesStock) {
		this.unidadesStock = unidadesStock;
	}
	
	
	
}
