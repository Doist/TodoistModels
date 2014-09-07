package com.todoist.model;

import java.util.Collection;
import java.util.TreeSet;

public class BaseItem extends TodoistObjectWithId {
    public static final int MIN_INDENT = 1;
    public static final int MAX_INDENT = 5;
    public static final int MIN_PRIORITY = 1;
    public static final int MAX_PRIORITY = 4;

    private String content;
    private long projectId;
    private int indent;
    private int priority;
    private String dateString;
    private Long dueDate;
    private int itemOrder;
    private int dayOrder;
    private boolean checked;
    private boolean collapsed;
    private Long assignedByUid;
    private Long responsibleUid;
    private boolean inHistory;
    private Collection<Long> labels = new TreeSet<>();
    private boolean archived;

    public BaseItem(long id, String content, long projectId, int indent, int priority, String dateString, Long dueDate,
                    int itemOrder, int dayOrder, boolean checked, boolean collapsed,
                    Long assignedByUid, Long responsibleUid, boolean inHistory, Collection<Long> labels,
                    boolean archived, boolean deleted) {
        super(id, deleted);
        this.content = content;
        this.projectId = projectId;
        this.indent = indent;
        this.priority = priority;
        this.dateString = dateString;
        this.dueDate = dueDate;
        this.itemOrder = itemOrder;
        this.dayOrder = dayOrder;
        this.checked = checked;
        this.collapsed = collapsed;
        this.assignedByUid = assignedByUid;
        this.responsibleUid = responsibleUid;
        this.inHistory = inHistory;
        this.archived = archived;
        if (labels != null) {
            this.labels.addAll(labels);
        }
    }

    public BaseItem(long id, String content, long projectId, int indent, int priority, String dateString, Long dueDate,
                    int itemOrder, int dayOrder, boolean checked, boolean collapsed, Long assignedByUid,
                    Long responsibleUid, boolean inHistory, Collection<Long> labels) {
        this(id, content, projectId, indent, priority, dateString, dueDate, itemOrder, dayOrder, checked, collapsed,
             assignedByUid, responsibleUid, inHistory, labels, false, false);
    }

    public BaseItem(long id, String content, long projectId, int indent, int priority, String dateString, Long dueDate,
                    int itemOrder, Long assignedByUid, Long responsibleUid, Collection<Long> labels) {
        this(id, content, projectId, indent, priority, dateString, dueDate, itemOrder, -1, false, false,
             assignedByUid, responsibleUid, false, labels, false, false);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    /**
     * Returns the indent within the bounds defined by {@link #MIN_INDENT} and {@link #MAX_INDENT}.
     */
    public int getIndent() {
        return Utils.trim(indent, MIN_INDENT, MAX_INDENT);
    }

    public void setIndent(int indent) {
        this.indent = indent;
    }

    /**
     * Returns the priority within the bounds defined by {@link #MIN_PRIORITY} and {@link #MAX_PRIORITY}.
     */
    public int getPriority() {
        return Utils.trim(priority, MIN_PRIORITY, MAX_PRIORITY);
    }

    /**
     * Sets the priority, with the side effect of resetting the day order to its default value of -1.
     */
    public void setPriority(int priority) {
        this.priority = priority;
        this.dayOrder = -1;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    public Long getDueDate() {
        return dueDate;
    }

    /**
     * Sets the due date, with the side effect of resetting the day order to its default value of -1.
     */
    public void setDueDate(Long dueDate) {
        this.dueDate = dueDate;
        this.dayOrder = -1;
    }

    public int getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(int itemOrder) {
        this.itemOrder = itemOrder;
    }

    public int getDayOrder() {
        return dayOrder;
    }

    public void setDayOrder(int dayOrder) {
        this.dayOrder = dayOrder;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean isCollapsed() {
        return collapsed;
    }

    public void setCollapsed(boolean collapsed) {
        this.collapsed = collapsed;
    }

    public Long getAssignedByUid() {
        return assignedByUid;
    }

    public void setAssignedByUid(Long assignedByUid) {
        this.assignedByUid = assignedByUid;
    }

    public Long getResponsibleUid() {
        return responsibleUid;
    }

    public void setResponsibleUid(Long responsibleUid) {
        this.responsibleUid = responsibleUid;
    }

    public boolean isInHistory() {
        return inHistory;
    }

    public void setInHistory(boolean inHistory) {
        this.inHistory = inHistory;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    /**
     * Returns an ordered collection of label ids.
     */
    public Collection<Long> getLabels() {
        return labels;
    }

    /**
     * Sets the label ids. The internal collection is cleared and copies the elements in {@code labels}, if any.
     */
    public void setLabels(Collection<Long> labels) {
        this.labels.clear();
        if (labels != null) {
            this.labels.addAll(labels);
        }
    }

    public void addLabel(Long label) {
        labels.add(label);
    }
}
