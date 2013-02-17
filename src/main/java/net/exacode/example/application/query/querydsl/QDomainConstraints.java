package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QDomainConstraints is a Querydsl query type for QDomainConstraints
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDomainConstraints extends com.mysema.query.sql.RelationalPathBase<QDomainConstraints> {

    private static final long serialVersionUID = 1630325006;

    public static final QDomainConstraints domainConstraints = new QDomainConstraints("domain_constraints");

    public final SimplePath<Object> constraintCatalog = createSimple("constraint_catalog", Object.class);

    public final SimplePath<Object> constraintName = createSimple("constraint_name", Object.class);

    public final SimplePath<Object> constraintSchema = createSimple("constraint_schema", Object.class);

    public final SimplePath<Object> domainCatalog = createSimple("domain_catalog", Object.class);

    public final SimplePath<Object> domainName = createSimple("domain_name", Object.class);

    public final SimplePath<Object> domainSchema = createSimple("domain_schema", Object.class);

    public final SimplePath<Object> initiallyDeferred = createSimple("initially_deferred", Object.class);

    public final SimplePath<Object> isDeferrable = createSimple("is_deferrable", Object.class);

    public QDomainConstraints(String variable) {
        super(QDomainConstraints.class, forVariable(variable), "information_schema", "domain_constraints");
    }

    @SuppressWarnings("all")
    public QDomainConstraints(Path<? extends QDomainConstraints> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "domain_constraints");
    }

    public QDomainConstraints(PathMetadata<?> metadata) {
        super(QDomainConstraints.class, metadata, "information_schema", "domain_constraints");
    }

}

