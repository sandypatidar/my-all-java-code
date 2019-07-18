class Employ {
	int eno ;
	String name;
	public Employ(String name, int eno){
		this.name=name;
		this.eno=eno;
	}
	public String re(){
		return name+":"+eno;
	}
}
class Lembda3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Employ("sandeep",1223));
		list.add(new Employ("pawan",4567));
		list.add(new Employ("faran",9878));
		list.add(new Employ("sandeep",1223));
		list.add(new Employ("sandeep",1223));
	}
}