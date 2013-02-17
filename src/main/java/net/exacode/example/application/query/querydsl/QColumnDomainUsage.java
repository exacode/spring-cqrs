package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QColumnDomainUsage is a Querydsl query type for QColumnDomainUsage
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QColumnDomainUsage extends com.mysema.query.sql.RelationalPathBase<QColumnDomainUsage> {

    private static final long serialVersionUID = 2071316547;

    public static final QColumnDomainUsage columnDomainUsage = new QColumnDomainUsage("column_domain_usage");

    public final SimplePath<Object> columnName = createSimple("column_name", Object.class);

    public final SimplePath<Object> domainCatalog = createSimple("domain_catalog", Object.class);

    public final SimplePath<Object> domainName = createSimple("domain_name", Object.class);

    public final SimplePath<Object> domainSchema = createSimple("domain_schema", Object.class);

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public QColumnDomainUsage(String variable) {
        super(QColumnDomainUsage.class, forVariable(variable), "information_schema", "column_domain_usage");
    }

    @SuppressWarnings("all")
    public QColumnDomainUsage(Path<? extends QColumnDomainUsage> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "column_domain_usage");
    }

    public QColumnDomainUsage(PathMetadata<?> metadata) {
        super(QColumnDomainUsage.class, metadata, "information_schema", "column_domain_usage");
    }

}

