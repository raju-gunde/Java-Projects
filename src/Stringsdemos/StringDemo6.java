package Stringsdemos;

public class StringDemo6 {
	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("raju");
		for (int i = 0; i < 10000000; i++) {
			sb.append("archana");
		}

		long endtime = System.currentTimeMillis();
		System.out.println(endtime - starttime);
		long starttime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("raju");
		for (int i = 0; i < 10000000; i++) {
			sb.append("archana");
		}

		long endtime1 = System.currentTimeMillis();
		System.out.println(endtime1 - starttime1);
	}

}
