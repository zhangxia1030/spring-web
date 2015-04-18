package com.zx.entity;

public class User
{
	private String name;
	private String age;
	private String address;
	private String work;

	/**
	 * @Description
	 * @return
	 */
	public String getName()
	{

		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name)
	{

		this.name = name;
	}

	/**
	 * @Description
	 * @return
	 */
	public String getAge()
	{

		return age;
	}

	/**
	 * @param age
	 */
	public void setAge(String age)
	{

		this.age = age;
	}

	/**
	 * @Description
	 * @return
	 */
	public String getAddress()
	{

		return address;
	}

	/**
	 * @param address
	 */
	public void setAddress(String address)
	{

		this.address = address;
	}

	/**
	 * @Description
	 * @return
	 */
	public String getWork()
	{

		return work;
	}

	/**
	 * @param work
	 */
	public void setWork(String work)
	{

		this.work = work;
	}

	@Override
	public String toString()
	{

		return "姓名：" + this.name + " 年龄：" + this.age + " 地址：" + this.address + " 职业：" + this.work;
	}

}
