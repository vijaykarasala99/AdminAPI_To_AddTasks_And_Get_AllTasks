package com.vijayit.binding;
import java.time.LocalDate;
import jakarta.persistence.Lob;
import lombok.Data;
@Data
public class TaskForm {
	private Integer taskId;
	private String taskName;
    private LocalDate deadLine;
    @Lob
    private byte[] file;
    
	public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}
	public LocalDate getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(LocalDate deadLine) {
		this.deadLine = deadLine;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}
