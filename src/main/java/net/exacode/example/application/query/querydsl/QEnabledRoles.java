package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QEnabledRoles is a Querydsl query type for QEnabledRoles
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QEnabledRoles extends com.mysema.query.sql.RelationalPathBase<QEnabledRoles> {

    private static final long serialVersionUID = 109923392;

    public static final QEnabledRoles enabledRoles = new QEnabledRoles("enabled_roles");

    public final SimplePath<Object> roleName = createSimple("role_name", Object.class);

    public QEnabledRoles(String variable) {
        super(QEnabledRoles.class, forVariable(variable), "information_schema", "enabled_roles");
    }

    @SuppressWarnings("all")
    public QEnabledRoles(Path<? extends QEnabledRoles> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "enabled_roles");
    }

    public QEnabledRoles(PathMetadata<?> metadata) {
        super(QEnabledRoles.class, metadata, "information_schema", "enabled_roles");
    }

}

