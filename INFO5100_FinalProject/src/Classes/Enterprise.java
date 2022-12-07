/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author manideepakreddyaila
 */
public abstract class Enterprise extends Organization {

    // private 
    private EnterpriseType enterpriseType;

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }

    public enum EnterpriseType {
        Medical("Medical"),
        Voluntary("Voluntary"),
        Government("Government"),
        Warehouse("Warehouse");

        private String type;

        private EnterpriseType(String type) {
            this.type = type;
        }

        public String getValue() {
            return type;
        }

        @Override
        public String toString() {
            return type;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

}
