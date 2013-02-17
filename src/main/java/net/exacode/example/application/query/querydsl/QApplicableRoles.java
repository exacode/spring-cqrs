package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QApplicableRoles is a Querydsl query type for QApplicableRoles
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QApplicableRoles extends com.mysema.query.sql.RelationalPathBase<QApplicableRoles> {

    private static final long serialVersionUID = -2042886246;

    public static final QApplicableRoles applicableRoles = new QApplicableRoles("applicable_roles");

    public final SimplePath<Object> grantee = createSimple("grantee", Object.class);

    public final SimplePath<Object> isGrantable = createSimple("is_grantable", Object.class);

    public final SimplePath<Object> roleName = createSimple("role_name", Object.class);

    public QApplicableRoles(String variable) {
        super(QApplicableRoles.class, forVariable(variable), "information_schema", "applicable_roles");
    }

    @SuppressWarnings("all")
    public QApplicableRoles(Path<? extends QApplicableRoles> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "applicable_roles");
    }

    public QApplicableRoles(PathMetadata<?> metadata) {
        super(QApplicableRoles.class, metadata, "information_schema", "applicable_roles");
    }

}

