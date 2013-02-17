package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTablePrivileges is a Querydsl query type for QTablePrivileges
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QTablePrivileges extends com.mysema.query.sql.RelationalPathBase<QTablePrivileges> {

    private static final long serialVersionUID = 1044684684;

    public static final QTablePrivileges tablePrivileges = new QTablePrivileges("table_privileges");

    public final SimplePath<Object> grantee = createSimple("grantee", Object.class);

    public final SimplePath<Object> grantor = createSimple("grantor", Object.class);

    public final SimplePath<Object> isGrantable = createSimple("is_grantable", Object.class);

    public final SimplePath<Object> privilegeType = createSimple("privilege_type", Object.class);

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public final SimplePath<Object> withHierarchy = createSimple("with_hierarchy", Object.class);

    public QTablePrivileges(String variable) {
        super(QTablePrivileges.class, forVariable(variable), "information_schema", "table_privileges");
    }

    @SuppressWarnings("all")
    public QTablePrivileges(Path<? extends QTablePrivileges> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "table_privileges");
    }

    public QTablePrivileges(PathMetadata<?> metadata) {
        super(QTablePrivileges.class, metadata, "information_schema", "table_privileges");
    }

}

