package com.spirit.consumer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdetails", schema="usr")
public class UserDetails {

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		@Column(name="uid")
		private int uid; 
		
		private String uname; 
		
		private String address; 
		
		private int phno;

		public int getUid() {
			return uid;
		}

		public void setUid(int uid) {
			this.uid = uid;
		}

		public String getUname() {
			return uname;
		}

		public void setUname(String uname) {
			this.uname = uname;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getPhno() {
			return phno;
		}

		public void setPhno(int phno) {
			this.phno = phno;
		} 
		
	
}
