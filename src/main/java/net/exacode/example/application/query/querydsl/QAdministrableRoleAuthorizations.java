package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAdministrableRoleAuthorizations is a Querydsl query type for QAdministrableRoleAuthorizations
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QAdministrableRoleAuthorizations extends com.mysema.query.sql.RelationalPathBase<QAdministrableRoleAuthorizations> {

    private static final long serialVersionUID = 771594013;

    public static final QAdministrableRoleAuthorizations administrableRoleAuthorizations = new QAdministrableRoleAuthorizations("administrable_role_authorizations");

    public final SimplePath<Object> grantee = createSimple("grantee", Object.class);

    public final SimplePath<Object> isGrantable = createSimple("is_grantable", Object.class);

    public final SimplePath<Object> roleName = createSimple("role_name", Object.class);

    public QAdministrableRoleAuthorizations(String variable) {
        super(QAdministrableRoleAuthorizations.class, forVariable(variable), "information_schema", "administrable_role_authorizations");
    }

    @SuppressWarnings("all")
    public QAdministrableRoleAuthorizations(Path<? extends QAdministrableRoleAuthorizations> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "administrable_role_authorizations");
    }

    public QAdministrableRoleAuthorizations(PathMetadata<?> metadata) {
        super(QAdministrableRoleAuthorizations.class, metadata, "information_schema", "administrable_role_authorizations");
    }

}

