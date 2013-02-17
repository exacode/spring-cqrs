package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QDomainUdtUsage is a Querydsl query type for QDomainUdtUsage
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDomainUdtUsage extends com.mysema.query.sql.RelationalPathBase<QDomainUdtUsage> {

    private static final long serialVersionUID = 1867770116;

    public static final QDomainUdtUsage domainUdtUsage = new QDomainUdtUsage("domain_udt_usage");

    public final SimplePath<Object> domainCatalog = createSimple("domain_catalog", Object.class);

    public final SimplePath<Object> domainName = createSimple("domain_name", Object.class);

    public final SimplePath<Object> domainSchema = createSimple("domain_schema", Object.class);

    public final SimplePath<Object> udtCatalog = createSimple("udt_catalog", Object.class);

    public final SimplePath<Object> udtName = createSimple("udt_name", Object.class);

    public final SimplePath<Object> udtSchema = createSimple("udt_schema", Object.class);

    public QDomainUdtUsage(String variable) {
        super(QDomainUdtUsage.class, forVariable(variable), "information_schema", "domain_udt_usage");
    }

    @SuppressWarnings("all")
    public QDomainUdtUsage(Path<? extends QDomainUdtUsage> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "domain_udt_usage");
    }

    public QDomainUdtUsage(PathMetadata<?> metadata) {
        super(QDomainUdtUsage.class, metadata, "information_schema", "domain_udt_usage");
    }

}

