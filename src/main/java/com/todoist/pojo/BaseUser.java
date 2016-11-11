package com.todoist.pojo;

public class BaseUser extends Person {
    private String apiToken;
    private BaseTzInfo tzInfo;
    private boolean isPremium;
    private Long premiumUntil;
    private Long freeTrialExpires;
    private String startPage;
    private Integer startDay;
    private Integer nextWeek;
    private String defaultReminder;
    private Long teamInbox;
    private Integer shareLimit;
    private Long karma;
    private String karmaTrend;
    private boolean karmaDisabled;
    private Integer completedCount;
    private Integer completedToday;
    private Integer autoReminder;
    private Integer theme;
    private BaseFeatures features;

    public BaseUser(long id, String email, String fullName, String imageId, String apiToken, BaseTzInfo tzInfo,
                    boolean isPremium, Long premiumUntil, Long freeTrialExpires, String startPage, Integer startDay,
                    Integer nextWeek, String defaultReminder, Long teamInbox, Integer shareLimit, Long karma,
                    String karmaTrend, boolean karmaDisabled, Integer completedCount, Integer completedToday,
                    Integer autoReminder, Integer theme, BaseFeatures features) {
        super(id, email, fullName, imageId, false);
        this.apiToken = apiToken;
        this.tzInfo = tzInfo;
        this.isPremium = isPremium;
        this.premiumUntil = premiumUntil;
        this.freeTrialExpires = freeTrialExpires;
        this.startPage = startPage;
        this.startDay = startDay;
        this.nextWeek = nextWeek;
        this.defaultReminder = defaultReminder;
        this.teamInbox = teamInbox;
        this.shareLimit = shareLimit;
        this.karma = karma;
        this.karmaTrend = karmaTrend;
        this.karmaDisabled = karmaDisabled;
        this.completedCount = completedCount;
        this.completedToday = completedToday;
        this.autoReminder = autoReminder;
        this.theme = theme;
        this.features = features;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public BaseTzInfo getTzInfo() {
        return tzInfo;
    }

    public void setTzInfo(BaseTzInfo tzInfo) {
        this.tzInfo = tzInfo;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public Long getPremiumUntil() {
        return premiumUntil;
    }

    public void setPremiumUntil(Long premiumUntil) {
        this.premiumUntil = premiumUntil;
    }

    public Long getFreeTrialExpires() {
        return freeTrialExpires;
    }

    public void setFreeTrialExpires(Long freeTrialExpires) {
        this.freeTrialExpires = freeTrialExpires;
    }

    public String getStartPage() {
        return startPage;
    }

    public void setStartPage(String startPage) {
        this.startPage = startPage;
    }

    public Integer getStartDay() {
        return startDay;
    }

    public void setStartDay(Integer startDay) {
        this.startDay = startDay;
    }

    public Integer getNextWeek() {
        return nextWeek;
    }

    public void setNextWeek(Integer nextWeek) {
        this.nextWeek = nextWeek;
    }

    public String getDefaultReminder() {
        return defaultReminder;
    }

    public void setDefaultReminder(String defaultReminder) {
        this.defaultReminder = defaultReminder;
    }

    public Long getTeamInbox() {
        return teamInbox;
    }

    public void setTeamInbox(Long teamInbox) {
        this.teamInbox = teamInbox;
    }

    public Integer getShareLimit() {
        return shareLimit;
    }

    public void setShareLimit(Integer shareLimit) {
        this.shareLimit = shareLimit;
    }

    public Long getKarma() {
        return karma;
    }

    public void setKarma(Long karma) {
        this.karma = karma;
    }

    public String getKarmaTrend() {
        return karmaTrend;
    }

    public void setKarmaTrend(String karmaTrend) {
        this.karmaTrend = karmaTrend;
    }

    public boolean isKarmaDisabled() {
        return karmaDisabled;
    }

    public void setKarmaDisabled(boolean karmaDisabled) {
        this.karmaDisabled = karmaDisabled;
    }

    public Integer getCompletedCount() {
        return completedCount;
    }

    public void setCompletedCount(Integer completedCount) {
        this.completedCount = completedCount;
    }

    public Integer getCompletedToday() {
        return completedToday;
    }

    public void setCompletedToday(Integer completedToday) {
        this.completedToday = completedToday;
    }

    public Integer getAutoReminder() {
        return autoReminder;
    }

    public void setAutoReminder(Integer autoReminder) {
        this.autoReminder = autoReminder;
    }

    public Integer getTheme() {
        return theme;
    }

    public void setTheme(Integer theme) {
        this.theme = theme;
    }

    public BaseFeatures getFeatures() {
        return features;
    }

    public void setFeatures(BaseFeatures features) {
        this.features = features;
    }
}
