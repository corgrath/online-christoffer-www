package online.christoffer.www.data;

public enum TagCategory {

    LANG("Programming Languages"),
    DATAFORMAT("Data Formats"),
    DB("Databases"),
    VERSION_CONTROL_SYSTEM("Version Control Systems"),
    BUILD_TOOL("Build Tools"),
    TEAM_COLLAB_TOOL("Team Code Collaboration Tools"),
    CLOUD_SERVICE_PROVIDER("Cloud Service Providers"),
    CONTINUOUS_INTEGRATION_TOOL("Continuous Integration Tools"),
    TESTING_PRACTICES("Testing Practices"),
    PROJECT_MANAGEMENT_METHODOLOGIES("Project Management Methodologies"),
    OPERATING_SYSTEM("Operating Systems"),
    FRAMEWORKS("Software Development Frameworks"),
    TECHNOLOGIES("Technologies"),
    ENGINEERING_PROCESSES("Engineering Processes"),
    SECURITY_PRACTICES("Security Practices"),
    ACCESSIBILITY_PRACTICES("Accessibility Practices"),
    CDP("Customer Data Platforms"),
    BUSINESS_PRACTICES("Business Practices"),
    MISC("Miscellaneous");

    private final String label;

    TagCategory(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

}
