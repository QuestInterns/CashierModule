package me.salisuwy;

import javax.persistence.*;

@Entity @Table(name="qpd_trans")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="PatientID")
    private String patientId;
    @Column(name="TransactionRef")
    private String transactionRef;
    private String title;
    private String content;
    private String biller;
    @Column(name="TransactionDate")
    private String transactionDate;

    public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionRef() {
		return transactionRef;
	}

	public void setTransactionRef(String transactionRef) {
		this.transactionRef = transactionRef;
	}

	public String getBiller() {
		return biller;
	}

	public void setBiller(String biller) {
		this.biller = biller;
	}

	public Blog() {  }

    public Blog(String title, String content) {
        this.setTitle(title);
        this.setContent(content);
    }

    public Blog(int id, String title, String content) {
        this.setId(id);
        this.setTitle(title);
        this.setContent(content);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "TransactionID=" + id +
                "PatientID=" + patientId +
                ", TransactionRef='" + transactionRef + '\'' +
                ", TransactionType='" + title + '\'' +
                ", ItemID='" + content + '\'' +
                ", Biller='" + biller + '\'' +
                ", TransactionDate='" + transactionDate + '\'' +
                '}';
    }
}
