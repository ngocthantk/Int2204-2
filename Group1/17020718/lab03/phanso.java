package oop.java;



public class phanso {
    private int tu,mau;

    public void settu(int tu)
    {
        this.tu=tu;
    }
    public void setmau(int mau)
    {
        this.mau=mau;

    }

    public int gettu()
    {
        return this.tu;
    }
    public int getmau()
    {
        return this.mau;
    }
    public phanso cong(phanso p1,phanso p2)
    {
        phanso p=new phanso();
        p.tu=p1.gettu()+p2.gettu();
        p.mau=p1.getmau();
        return p;

    }
	
	public phanso tru(phanso p1,phanso p2)
    {
        phanso p=new phanso();
        p.tu=p1.gettu()-p2.gettu();
        p.mau=p1.getmau();
        return p;

    }
	public phanso nhan(phanso p1, phanso p2) 
	{
		
	}