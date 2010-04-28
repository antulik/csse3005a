package edu.itee.antipodes.domain.pages;

import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;

public final class BillingTourOperators {
	
	@NotBlank
	private String exportFormat;
	
	@NotBlank
	@MaxLength(15)
	private String fromDate;
	
	@NotBlank
	private String toDate;
	
	@NotBlank
	private String tourOperatorID;

	public String getExportFormat() {
		return exportFormat;
	}

	
	
	
	
	
	public String getFromDate() {
		return fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public String getTourOperatorID() {
		return tourOperatorID;
	}

	public void setExportFormat(String exportFormat) {
		this.exportFormat = exportFormat;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public void setTourOperatorID(String tourOperatorID) {
		this.tourOperatorID = tourOperatorID;
	}
	
}
