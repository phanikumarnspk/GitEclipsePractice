package com.slokams;

import java.util.Objects;

public class College {

	
		private int cid;
		private String cname;
		private String cloc;
		
		//constructor
		public College(int cid, String cname, String cloc) {
			super();
			this.cid = cid;
			this.cname = cname;
			this.cloc = cloc;
		}
		
		
		public College()
		{
			
			
		}

          //tostring method
		@Override
		public String toString() {
			return "cid=" + cid + ", cname=" + cname + ", cloc=" + cloc ;
		}

		@Override
		public int hashCode() {
			return Objects.hash(cid, cloc, cname);
		}
         //hashcode and equals method
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			College other = (College) obj;
			return cid == other.cid && Objects.equals(cloc, other.cloc) && Objects.equals(cname, other.cname);
		}
		
		
		
	

}
