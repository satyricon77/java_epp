package internalpackage.jaxbparser.models.responses.domaininforesponse;

import javax.xml.bind.annotation.XmlElement;

public class DomainData {

    @XmlElement(name = "domainName")
    private String domainName;
    @XmlElement(name = "password")
    private String password;
    @XmlElement(name = "registrantId")
    private String registrantId;
    @XmlElement(name = "roId")
    private String roId;
    @XmlElement(name = "sponsorClient")
    private String sponsorClient;
    @XmlElement(name = "updateClient")
    private String updateClient;
    @XmlElement(name = "createClient")
    private String createClient;
    @XmlElement(name = "createDate")
    private String createDate;
    @XmlElement(name = "expiryDate")
    private String expiryDate;
    @XmlElement(name = "transferDate")
    private String transferDate;
    @XmlElement(name = "updateDate")
    private String updateDate;
    @XmlElement(name = "nameServers")
    private String nameServers;
    @XmlElement(name = "subordinateHosts")
    private String subordinateHosts;
    @XmlElement(name = "adminContacts")
    private String adminContacts;
    @XmlElement(name = "billingContacts")
    private String billingContacts;
    @XmlElement(name = "techContacts")
    private String techContacts;
    @XmlElement(name = "rgpStatuses")
    private String rgpStatuses;
    @XmlElement(name = "rgpDates")
    private String rgpDates;
    @XmlElement(name = "idnScriptLanguage")
    private String idnScriptLanguage;
    @XmlElement(name = "statuses")
    private String statuses;

    public DomainData(String domainName, String password, String registrantId, String roId, String sponsorClient,
                      String updateClient, String createClient, String createDate, String expiryDate, String transferDate,
                      String updateDate, String nameServers, String subordinateHosts, String adminContacts, String billingContacts,
                      String techContacts, String rgpStatuses, String rgpDates, String idnScriptLanguage, String statuses) {
        this.domainName = domainName;
        this.password = password;
        this.registrantId = registrantId;
        this.roId = roId;
        this.sponsorClient = sponsorClient;
        this.updateClient = updateClient;
        this.createClient = createClient;
        this.createDate = createDate;
        this.expiryDate = expiryDate;
        this.transferDate = transferDate;
        this.updateDate = updateDate;
        this.nameServers = nameServers;
        this.subordinateHosts = subordinateHosts;
        this.adminContacts = adminContacts;
        this.billingContacts = billingContacts;
        this.techContacts = techContacts;
        this.rgpStatuses = rgpStatuses;
        this.rgpDates = rgpDates;
        this.idnScriptLanguage = idnScriptLanguage;
        this.statuses = statuses;
    }

    public DomainData() {
    }

    @Override
    public String toString() {
        return "Domain Name = '" + domainName + '\'' +
                "; Password = '" + password + '\'' +
                "; Registrant ID = '" + registrantId + '\'' +
                "; roId = '" + roId + '\'' +
                "; Sponsor Client = '" + sponsorClient + '\'' +
                "; Update Client = '" + updateClient + '\'' +
                "; Create Client = '" + createClient + '\'' +
                "; Create Date = '" + createDate + '\'' +
                "; Expiry Date = '" + expiryDate + '\'' +
                "; Transfer Date = '" + transferDate + '\'' +
                "; Update Date = '" + updateDate + '\'' +
                "; Name Servers = '" + nameServers + '\'' +
                "; Subordinate Hosts = '" + subordinateHosts + '\'' +
                "; Admin Contacts = '" + adminContacts + '\'' +
                "; Billing Contacts = '" + billingContacts + '\'' +
                "; Tech Contacts = '" + techContacts + '\'' +
                "; RGP Statuses = '" + rgpStatuses + '\'' +
                "; RGP Dates = '" + rgpDates + '\'' +
                "; Idn Script Language = '" + idnScriptLanguage + '\'' +
                "; Statuses = '" + statuses + '\'';
    }
}
