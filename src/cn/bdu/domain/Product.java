package cn.bdu.domain;

import java.io.Serializable;


/*
 * 如果大家要在HashMap的“键”部分存放自定义的对象
 * 一定要在这个对象里用自己的equals和hashCode方法来覆盖Object里的同名方法。
 */

public class Product implements Serializable {

	private String id; // 商品编号
	private String name; // 名称
	private double price; // 价格
	private String category; // 分类
	private int pnum; // 数量
	private String imgurl; // 图片路径
	private String description; // 描述

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	public String getImgurl() {
		return imgurl;
	}

	// a.jpg a_s.jpg
	public String getImgurl_s() {
		int index = imgurl.lastIndexOf("."); // 得到最的.的索引
		String first = imgurl.substring(0, index);

		String last = imgurl.substring(index);

		return first + "_s" + last;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ ", category=" + category + ", pnum=" + pnum + ", imgurl="
				+ imgurl + ", description=" + description + ", totalSaleNum="
				+ "]";
	}

}
