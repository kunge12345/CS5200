package edu.neu.cs5200.flickr.client.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Photo {
	@XmlAttribute
	String id;
	@XmlAttribute
	String owner;
	@XmlAttribute
	String secret;
	@XmlAttribute
	String server;
	@XmlAttribute
	String farm;
	@XmlAttribute
	String title;
	@XmlAttribute
	String ispublic;
	@XmlAttribute
	String isfriend;
	@XmlAttribute
	String isfamily;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getFarm() {
		return farm;
	}
	public void setFarm(String farm) {
		this.farm = farm;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIspublic() {
		return ispublic;
	}
	public void setIspublic(String ispublic) {
		this.ispublic = ispublic;
	}
	public String getIsfriend() {
		return isfriend;
	}
	public void setIsfriend(String isfriend) {
		this.isfriend = isfriend;
	}
	public String getIsfamily() {
		return isfamily;
	}
	public void setIsfamily(String isfamily) {
		this.isfamily = isfamily;
	}
}
