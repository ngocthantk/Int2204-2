public class PhanSo {

private int ts;
private int ms;

public PhanSo(int ts, int ms) {
this.ts = ts;
this.ms = ms;
}

public int getTs() {
return ts;
}

public void setTs(int ts) {
this.ts = ts;
}

public int getMs() {
return ms;
}

public void setMs(int ms) {
this.ms = ms;
}

public static int UCLN(int a, int b) {
while (a != b) {
if (a > b) {
a = a - b;
} else {
b = b - a;
}

}
return a;
}

public void PhanSoToiGian() {
int k = UCLN(this.getTs(), this.getMs());
this.setTs(this.getTs() / k);
this.setMs(this.getMs() / k);
}

public void congPhanSo(PhanSo ps) {
int TS = this.getTs() * ps.getMs() + ps.getTs() * this.getMs();
int MS = this.getMs() * ps.getMs();
PhanSo tongPhanSo = new PhanSo(TS, MS);
tongPhanSo.PhanSoToiGian();
System.out.println("Tổng hai phân số = " + tongPhanSo.ts
+ "/" + tongPhanSo.ms);
}

public void truPhanSo(PhanSo ps) {
int TS = this.getTs() * ps.getMs() - ps.getTs() * this.getMs();
int MS = this.getMs() * ps.getMs();
PhanSo hieuPhanSo = new PhanSo(TS, MS);
hieuPhanSo.PhanSoToiGian();
System.out.println("Hiệu hai phân số = " + hieuPhanSo.ts
+ "/" + hieuPhanSo.ms);
}

public void nhanPhanSo(PhanSo ps) {
int TS = this.getTs() * ps.getTs();
int MS = this.getMs() * ps.getMs();
PhanSo tichPhanSo = new PhanSo(TS, MS);
tichPhanSo.PhanSoToiGian();
System.out.println("Tích hai phân số = " + tichPhanSo.ts
+ "/" + tichPhanSo.ms);

}

public void chiaPhanSo(PhanSo ps) {
int TS = this.getTs() * ps.getMs();
int MS = this.getMs() * ps.getTs();
PhanSo thuongPhanSo = new PhanSo(TS, MS);
thuongPhanSo.PhanSoToiGian();
System.out.println("Thương hai phân số = " + thuongPhanSo.ts
+ "/" + thuongPhanSo.ms);

}

public boolean equals(Object obj) {
if (this == obj) {
return true;
}
if (obj instanceof PhanSo) {
PhanSo ps1 = (PhanSo) obj;
return (this.ts * ps1.ms == this.ms * ps1.ts);

} else {
return false;
}

}

public static void main(String[] args) {
PhanSo pS1 = new PhanSo(5, 2);
PhanSo pS2 = new PhanSo(2, 3);
pS1.congPhanSo(pS2);
pS1.truPhanSo(pS2);
pS1.nhanPhanSo(pS2);
pS1.chiaPhanSo(pS2);

}
}