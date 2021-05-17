package Entities;

public class Campaign {
	
	private int id;
	private String campaingName;
	private String campaingDetail;
	
	public Campaign(int id, String campaingName, String campaingDetail) {
		super();
		this.id = id;
		this.campaingName = campaingName;
		this.campaingDetail = campaingDetail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public String getCampaingDetail() {
		return campaingDetail;
	}

	public void setCampaingDetail(String campaingDetail) {
		this.campaingDetail = campaingDetail;
	}

}
