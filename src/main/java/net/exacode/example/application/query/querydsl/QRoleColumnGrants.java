package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QRoleColumnGrants is a Querydsl query type for QRoleColumnGrants
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRoleColumnGrants extends com.mysema.query.sql.RelationalPathBase<QRoleColumnGrants> {

    private static final long serialVersionUID = 1560032167;

    public static final QRoleColumnGrants roleColumnGrants = new QRoleColumnGrants("role_column_grants");

    public final SimplePath<Object> columnName = createSimple("column_name", Object.class);

    public final SimplePath<Object> grantee = createSimple("grantee", Object.class);

    public final SimplePath<Object> grantor = createSimple("grantor", Object.class);

    public final SimplePath<Object> isGrantable = createSimple("is_grantable", Object.class);

    public final SimplePath<Object> privilegeType = createSimple("privilege_type", Object.class);

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public QRoleColumnGrants(String variable) {
        super(QRoleColumnGrants.class, forVariable(variable), "information_schema", "role_column_grants");
    }

    @SuppressWarnings("all")
    public QRoleColumnGrants(Path<? extends QRoleColumnGrants> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "role_column_grants");
    }

    public QRoleColumnGrants(PathMetadata<?> metadata) {
        super(QRoleColumnGrants.class, metadata, "information_schema", "role_column_grants");
    }

}

