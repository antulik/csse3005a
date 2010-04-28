package edu.itee.antipodes.domain.pages;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;

public final class MonitorSystemUtil {
	@NotBlank
	private String exportFormat;

	@NotBlank
	private String fromDate;
	
	@NotBlank
	private String toDate;
	
	
	
	
	
	
	
	public String getExportFormat() {
		return exportFormat;
	}

	public String getFromDate() {
		return fromDate;
	}

	public String getToDate() {
		return toDate;
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
}
