package Ab;
//interface : ���� ��� - �޼ҵ常 ����, �߰��� ������ ó���ϴ� ������ default�� �߰���(java14)
public interface method_2inter {	//ex 1â��, 2â��..
	//public String members; interface�� �޼ҵ���, class�� �ƴϱ� ������ �ʵ� �� �� ����
	//interface�� �޼ҵ��̹Ƿ� �ʵ忡 �ڷ����� ������ �� ����
	public String names();
	//abstract �� default ����
	default void setbox(String name) {	//setter
		//this.nm = name; �ʵ忡 �� �ø� this(x)
		System.out.println(name);
	};
	//interface���� default �����ϸ� ���� �޼ҵ带 �����
	default String box3() {	//getter
		return null;
	}
}

interface method_2re extends method_2inter{	//interface�� extends�� �θ� interface�� �ε� �� �� �ִ�.
	
}