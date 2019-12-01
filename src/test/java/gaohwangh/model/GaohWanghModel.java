package gaohwangh.model;

/**
 * @Author: GH
 * @Date: 2019/12/2 1:09
 * @Version 1.0
 */
public class GaohWanghModel {
	private Integer id;
	private String name;

	public GaohWanghModel() {
		System.out.println("GaohWangh...");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
