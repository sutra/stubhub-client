package org.oxerr.stubhub.client.model;

import java.util.List;

public class BulkProcessingResultSummaryResponse {

	private Long totalCount;

	private Boolean finished;

	private Boolean successful;

	private List<BulkProcessingResult> queued;

	private List<BulkProcessingResult> completed;

	private List<BulkProcessingResult> failed;

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Boolean getFinished() {
		return finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

	public Boolean getSuccessful() {
		return successful;
	}

	public void setSuccessful(Boolean successful) {
		this.successful = successful;
	}

	public List<BulkProcessingResult> getQueued() {
		return queued;
	}

	public void setQueued(List<BulkProcessingResult> queued) {
		this.queued = queued;
	}

	public List<BulkProcessingResult> getCompleted() {
		return completed;
	}

	public void setCompleted(List<BulkProcessingResult> completed) {
		this.completed = completed;
	}

	public List<BulkProcessingResult> getFailed() {
		return failed;
	}

	public void setFailed(List<BulkProcessingResult> failed) {
		this.failed = failed;
	}

}
